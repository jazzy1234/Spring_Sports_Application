function onPlayerSubmit(e){
    e.preventDefault()
    var player = {}
    player.name = document.getElementById("name").value
    player.age = document.getElementById("age").value
    player.height = document.getElementById("height").value
    player.yearsInLeague = document.getElementById("yearsInLeague").value

    fetch('http://localhost:8080/addPlayer',{
        method:'POST',
        headers:{
            'content-type':'application/json'
        },
        body:JSON.stringify(player)
    }).then(r => console.log(r))
}

function onStatSubmit(e){
    e.preventDefault()
    var playerStat = {}
    playerStat.name = document.getElementById("name2").value
    playerStat.ptsPerGame = document.getElementById("ppg").value
    playerStat.assistPerGame = document.getElementById("apg").value
    playerStat.turnoversPerGame = document.getElementById("tpg").value
    playerStat.reboundsPerGame = document.getElementById("rpg").value

    fetch('http://localhost:8080/addStat',{
        method:'POST',
        headers:{
            'content-type':'application/json'
        },
        body:JSON.stringify(playerStat)
    }).then(r => console.log(r))
}

document.getElementById('playerForm').addEventListener('submit', onPlayerSubmit)

document.getElementById('statForm').addEventListener('submit', onStatSubmit)