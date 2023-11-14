const cellak = document.querySelectorAll(".cella")
const felirat = document.querySelector("#gyoztes");
const restartBtn = document.querySelector("#restart");
const eselyek =
[
    // 0 1 2
    // 3 4 5
    // 6 7 8
    [0, 1 , 2],
    [3, 4, 5],
    [6 ,7 , 8],
    [0, 4, 8],
    [2, 4, 6],
    [0, 3, 6],
    [2, 5 , 8],
    [1, 4, 7,]

]

let opciok = ["", "", "", "", "", "", "", "", ""];
let jatekos = "X";

let futas = false;

Kezdes();
function Kezdes()
{
    cellak.forEach(cella => cella.addEventListener("click", cellclick))
    restartBtn.addEventListener("click", Ujrainditas);
    felirat.textContent = `Következik: ${jatekos}`
    futas = true;
}

function cellclick() {
    const cellIndex = this.getAttribute("cellIndex");
    if (opciok[cellIndex] !== "" || !futas) {
        return;
    }
    CellaFrissites(this, cellIndex);
    Gyoztes();
}


function CellaFrissites(cella, index){
    opciok[index] = jatekos;
    cella.textContent = jatekos;
}

function JatekosValtas()
{
    jatekos = (jatekos == "X") ? "O" : "X";
    felirat.textContent = `Következik: ${jatekos}`
}
function Gyoztes()
{
    let nyert = false;

    for(let i = 0; i < eselyek.length; i++)
    {
        const feltetel = eselyek[i] //Minden egy iterációban lekér egy győzelmi kombinációt
        console.log(feltetel)
        console.log(feltetel.length)
        //Ezt a győzelmi kombinációt bontja három elemre
        const cella1 = opciok[feltetel[0]]
        const cella2 = opciok[feltetel[1]]
        const cella3 = opciok[feltetel[2]]
        console.log("Hello1:" + cella1);
        console.log("Hello2:" + cella2);
        console.log("Hello3:" + cella3);
        console.log("FELTÉTEL:" +feltetel[0]);
        console.log("FELTÉTEL:" +feltetel[1]);
        console.log("FELTÉTEL:" +feltetel[2]);

        if(cella1 == "" ||cella2 == "" || cella3 == "") //Ha üres akkor megy tovább
        {
            continue;
        }
        if(cella1 == cella2 && cella2 == cella3) //Ha a három cella azonos értékű akkor van nyertes és megszakítja a for ciklust.
        {
            nyert = true;
            console.log("WIN\n cella1" + cella1 + "\ncella2: " + cella2 + "\ncella3" + cella3)
            break;
        }
    }
    if(nyert)
    {
        felirat.textContent = `${jatekos} nyert.`
        futas = false;
    }
    else if(!opciok.includes(""))
    {
        felirat.textContent = `Draw`
        futas = false;
    }
    else
    {
        JatekosValtas();
    }
}

function Ujrainditas()
{
    jatekos = "X";
    opciok = ["", "", "", "", "", "", "", "", ""];
    felirat.textContent = `Következik: ${jatekos}`;
    cellak.forEach(cell => cell.textContent = "");
    futas = true;
}
