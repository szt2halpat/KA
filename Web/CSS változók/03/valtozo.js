const root = document.querySelector(':root')
const rootStyle = getComputedStyle(root)
const color1 = rootStyle.getPropertyValue('--color1')

function change()
{
    let szamok = document.getElementById("szamok").value

    const szin = document.getElementById("color").value

    const divek = document.querySelectorAll('.container div')
    if(szamok >= 1 && szamok <= divek.length)
    {
        const valasztottDiv = divek[szamok - 1]
        console.log("választott: " + valasztottDiv.innerText)
        valasztottDiv.style.backgroundColor = szin;
    }

}