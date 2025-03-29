/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const result = [];
    
    // Loop through the original array
    for (let i = 0; i < arr.length; i++) {
        // Apply the mapping function and push the result
        result.push(fn(arr[i], i));
    }
    
    // Return the transformed array
    return result;
    
};