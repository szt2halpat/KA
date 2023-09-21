function change()
{

    const szelesseg = document.getElementById("width").value + "px";
    const magassag = document.getElementById("height").value + "px";

    const divek = document.querySelectorAll('.container div')

    divek.forEach(function(div) {
        div.style.width = szelesseg;
        div.style.height = magassag;
    })
}