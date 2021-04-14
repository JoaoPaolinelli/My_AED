'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    var consoInt = 0;
    var vogalInt = 0;
    var vogais = [ 'a', 'e', 'i', 'o','u'];
    for(var i =0; i < 10; i++){
        if()

    }
    for (var k =0; k < 10; k++){
        console.log(vogal[k]);
    }
    for (var k =0; k < 10; k++){
        console.log(consoante[k]);
    }    
    

}


function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}