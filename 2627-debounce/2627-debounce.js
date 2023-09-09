/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
     var timer;
    return function(...args) {
        //first we check if there is any timer left
        if(timer){
            clearTimeout(timer);
        }
        //else we call the fn after t ms
        timer=setTimeout(()=>{
            fn(...args);
        },t)
    }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */