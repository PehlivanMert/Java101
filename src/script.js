let timer;
let milliseconds = 0;
let seconds = 0;
let minutes = 0;

function start() {
    timer = setInterval(updateTime, 10);
}

function stop() {
    clearInterval(timer);
}

function reset() {
    clearInterval(timer);
    milliseconds = 0;
    seconds = 0;
    minutes = 0;
    updateTime();
}

function updateTime() {
    milliseconds += 10;

    if (milliseconds === 1000) {
        milliseconds = 0;
        seconds++;

        if (seconds === 60) {
            seconds = 0;
            minutes++;
        }
    }

    document.getElementById('milliseconds').innerText = padNumber(milliseconds);
    document.getElementById('seconds').innerText = padNumber(seconds);
    document.getElementById('minutes').innerText = padNumber(minutes);
}

function padNumber(number) {
    return (number < 10 ? '0' : '') + number;
}