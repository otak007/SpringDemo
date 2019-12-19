


function save(id, name, age, man, nationality){


    function addPost(event) {
        event.preventDefault();

        let name = document.getElementById('name').value;
        let age = document.getElementById('age').value;
        let man = document.getElementById('man').checked;
        let nationality = document.getElementById('nationality').value;


        const myPost = {
            title: title,
            body: body
        };    fetch('http://localhost:8080/user?id='+id+'&name='+name+'&age='+age+'&man='+man+'&nationality='+nationality, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(myPost)
        })
            .then((res) => res.json())
            .then((data) => console.log(data))
    }
    //
    // const Http = new XMLHttpRequest();
    // const url='http://localhost:8080/user?id='+id+'&name='+name+'&age='+age+'&man='+man+'&nationality='+nationality;
    // Http.open("POST", url);
    // Http.send();
    //
    // document.getElementById("identification").value = '';
    // document.getElementById("name").value = '';
    // document.getElementById("age").value = '';
    // document.getElementById("nationality").value = '';
    // Http.onreadystatechange = (e) => {
    //
    // }
}

function findAll() {

    fetch('http://localhost:8080/user/').then(response => response.json()).
    then(users => {
        let output = '<h2>List of Users<?h2>';

        output += '<ul>';

        users.forEach(function(user){
            output += setUserData(user);
        });

        output += `</ul>`;
        document.getElementById("response").innerHTML = output;
    });
}

        output += setUserData(user);

function find(id){

    fetch('http://localhost:8080/user/'+id).then(response => response.json()).
    then(user => {
        let output = '<h2>User<?h2>';
        output += '<ul>';

        output += setUserData(user);

        output += `</ul>`;
        document.getElementById("response").innerHTML = output;
    });
}

function setUserData(user){

    if (user.man == true){
        gender = 'male';
    }else{
        gender = 'female';
    }

    output = `<li>
        Name: ${user.name}<br/>
        Age: ${user.age} <br/>
        Gender: ${gender} <br/>
        Nationality: ${user.nationality}
    </li><br/>`;

    return output;
}