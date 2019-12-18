


function save(id, name, age, man, nationality){

    const Http = new XMLHttpRequest();
    const url='http://localhost:8080/user?id='+id+'&name='+name+'&age='+age+'&man='+man+'&nationality='+nationality;
    Http.open("POST", url);
    Http.send();

    document.getElementById("identification").value = '';
    document.getElementById("name").value = '';
    document.getElementById("age").value = '';
    document.getElementById("nationality").value = '';
    Http.onreadystatechange = (e) => {

    }
}


function find(id){

    const Http = new XMLHttpRequest();
    const url='http://localhost:8080/user/'+id;
    Http.open("GET", url);
    Http.send();


    Http.onreadystatechange = (e) => {
        if (Http.readyState == XMLHttpRequest.DONE) {
            console.log(JSON.parse(Http.response));

            const name = JSON.parse(Http.response).name;
            const age = JSON.parse(Http.response).age;
            const man = JSON.parse(Http.response).man;
            const nationality = JSON.parse(Http.response).nationality;

            document.getElementById("name").innerHTML = 'Name: '+name;
            document.getElementById("age").innerHTML = 'Age: '+age;
            document.getElementById("nationality").innerHTML = 'Nationality: '+nationality;
            if (man == true){
                document.getElementById("man").innerHTML = 'Gender: man';
            }else{
                document.getElementById("man").innerHTML = 'Gender: female';
            }
        }
    }
}
