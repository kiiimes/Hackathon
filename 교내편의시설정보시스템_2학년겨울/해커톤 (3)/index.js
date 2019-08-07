$(document).ready(function () {
    if (typeof (Storage !== "undefined")){
        if (localStorage.totalUser) {
        } else {
            localStorage.setItem('totalUser', '1');
            localStorage.setItem('ID-1', '16010977');
            localStorage.setItem('PW-1', '16010977');
        }
    }else{
        alert('Current Broser does not support web storage');
    }
})

function getIdData(id) {
    for (var i = 1; i <= Number(localStorage.totalUser); i++) {
        if (id == localStorage.getItem('ID-' + i)) {
            return i;
        }
    }
    return 0;
}

function loginClick() {
    var id, pw;

    id = document.getElementById('idInput').value;
    pw = document.getElementById('pwInput').value;
    document.getElementsByClassName('')
    console.log(id);
    console.log(pw);
    if (id == "" || pw == "") {
        alert('ID나 비밀번호가 입력되지 않았습니다.');
        return;
    }

    key = getIdData(id);
    if (key == 0 || pw != localStorage.getItem('PW-' + key)) {
        alert('잘못된 아이디나 비밀번호 입니다.');
        return;
    }

    sessionStorage.setItem('loggedIn', 1);
    sessionStorage.setItem('ID', localStorage.getItem('ID-' + key));

    getNextPage();
    
}
function getNextPage() {
    location.href = "./menu.html";
}
