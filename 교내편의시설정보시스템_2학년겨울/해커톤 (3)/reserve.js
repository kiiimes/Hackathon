$(document).ready(function (){
    $('#popupScreen').hide();
    $('#blackScreen').hide();
})

function makeTable(pos){

    var start_t, end_t;

    var time = document.getElementsByClassName("time");
    time = time[0].outerText;
    start_t = time.substr(4,2);
    end_t = time.substr(10, 2);
    
    var tbHead = '<table><tr>';
    var tbTail = '</tr><tr>';

    for(var i = 0; i < Number(end_t) - Number(start_t)+1; i++){
        tbHead +='<td>'+ (Number(start_t)+Number(i)) +'</td>';
        tbTail += '<td class="'+'table'+pos + '-' + i +'"></td>';
    }
    console.log(tbHead);
    console.log(tbTail);
    $(pos).append(
        '<div class="timeTable">' +
        tbHead + tbTail + '</tr>' + '</div>'
    );
}

function reserve(){
    $('#popupScreen').show();
    $('#blackScreen').show();




    makeTable('#popupScreen');
}