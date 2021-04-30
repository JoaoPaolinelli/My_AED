let canvas = document.getElementById("snake");
let context = canvas.getContext("2d");
let box = 32;
let snake = []; 
snake[0] ={
    x: 8 * box,
    y: 8 * box
}
let direction = "right";
let food ={
    x: Math.floor(Math.random() * 15 + 1) * box,
    y: Math.floor(Math.random() * 15 + 1) * box
}

function CreateBackGround(){
    context.fillStyle = "black";
    context.fillRect(0, 0, 16*box, 16*box);
}

function CreateSnake (){
    for(i = 0; i < snake.length; i++){
        context.fillStyle = "green";
        context.fillRect(snake[i].x, snake[i].y, box, box);
        context.fillStyle = "border-radius: 50%";
    }
}

function desenharComida (){
    context.fillStyle = "red";
    context.fillRect(food.x, food.y, box, box);
}


document.addEventListener('keydown', update);

function update(event){
    if(event.keyCode == 37 && direction != 'right') direction = 'left';
    if(event.keyCode == 38 && direction != 'down') direction = 'up';
    if(event.keyCode == 39 && direction != 'left') direction = 'right';
    if(event.keyCode == 40 && direction != 'up') direction = 'down';
}

function iniciarJogo(){    

    if(snake[0].x > 15*box && direction == "right") snake[0].x = 0;
    if(snake[0].x < 0 && direction == 'left') snake[0].x = 16 * box;
    if(snake[0].y > 15*box && direction == "down") snake[0].y = 0;
    if(snake[0].y < 0 && direction == 'up') snake[0].y = 16 * box;
    
    for(i = 1; i < snake.length; i++){
        if(snake[0].x == snake[i].x && snake[0].y == snake[i].y){
            clearInterval(jogo);
            alert('Over');
        }
    }

    CreateBackGround();
    CreateSnake();
    desenharComida();

    let snake_eixo_x = snake[0].x;
    let snake_eixo_y = snake[0].y;

    if(direction == "right") snake_eixo_x += box;
    if(direction == "left") snake_eixo_x -= box;
    if (direction == "up") snake_eixo_y -= box;
    if(direction == "down") snake_eixo_y += box;

    if(snake_eixo_x != food.x || snake_eixo_y != food.y){
        snake.pop(); //pop tira o último elemento da lista
    }else{
        food.x = Math.floor(Math.random() * 15 +1) * box;
        food.y = Math.floor(Math.random() * 15 +1) * box;
    }
    
    let cabeca ={
        x: snake_eixo_x,
        y: snake_eixo_y
    }

    snake.unshift(cabeca);
}

let jogo = setInterval(iniciarJogo, 100);