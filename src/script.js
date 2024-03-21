let timer;
let startTime;
let isRunning = false;
let milliseconds = 0;
let seconds = 0;
let minutes = 0;

function start() {
    if (!isRunning) {
        isRunning = true;
        startTime = performance.now() - milliseconds;
        requestAnimationFrame(updateTime);
    }
}

function stop() {
    if (isRunning) {
        isRunning = false;
        cancelAnimationFrame(timer);
    }
}

function reset() {
    stop();
    milliseconds = 0;
    seconds = 0;
    minutes = 0;
    updateTime();
}

function updateTime() {
    if (isRunning) {
        const elapsedTime = performance.now() - startTime;
        milliseconds = Math.floor(elapsedTime % 1000);
        seconds = Math.floor(elapsedTime / 1000) % 60;
        minutes = Math.floor(elapsedTime / (1000 * 60));

        updateDisplay();
        requestAnimationFrame(updateTime);
    }
}

function updateDisplay() {
    document.getElementById('milliseconds').innerText = padNumber(milliseconds);
    document.getElementById('seconds').innerText = padNumber(seconds);
    document.getElementById('minutes').innerText = padNumber(minutes);

    document.title = `${padNumber(minutes)}:${padNumber(seconds)}:${padNumber(milliseconds)}`;
}

function padNumber(number) {
    return (number < 10 ? '0' : '') + number;
}
