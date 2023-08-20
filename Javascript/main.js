const data = require('./data.json');
// Now you can access properties from the 'data' object

function getHealthyItems(){ 
    return data.filter((item)=>item.Health===true)
}

function getIDHealthyItems(){
    return data.filter((item)=>item.Health===true).map((item)=>item.UUID);
}
function getNamesUnhealthy() {
    return  data.filter((item)=>item.Health===false).forEach((item)=>console.log(" Gateway ",item.GatewayName," is Unhealthy"))
}

function getGateWayAHealth() {
    return data.filter((item)=>item.Health&&item.GatewayName==="Gateway_A").map((item)=>item.Stats).reduce((total,item)=>total+item.Latency,0)
}
// Absolutely, let's explore some advanced JavaScript concepts using the generated data. We'll focus on using array functions like `filter`, `forEach`, and `map`. Here are some questions and tasks you can work on:

// 1. **Using `filter`:**
//    - Can you filter and print all the objects where the "Health" property is `true`?
// console.log(getHealthyItems());

// 2. **Using `map`:**
//    - Create an array containing only the UUIDs from the objects where "Health" is `true`.
// console.log(getIDHealthyItems());

// 3. **Using `forEach`:**
//    - For each object where "Health" is `false`, print a sentence like "GatewayName is not healthy."
// console.log(getNamesUnhealthy());

// 4. **Combining `filter`, `map`, and `forEach`:**
//    - Filter the objects where the "GatewayName" is "Gateway_A" and "Health" is `true`. Then, using `map`, 
// create an array of just the "Stats" objects from these filtered results. Finally, using `forEach`, calculate and print the average latency for these "Gateway_A" objects.

console.log(getGateWayAHealth());

// 5. **Advanced Filtering:**
//    - Filter the objects where "Health" is `true`, then further filter those objects where "Stats.Connections" is greater than 25. Print the UUIDs of the filtered objects.

// 6. **Using `some` and `every`:**
//    - Check if there is at least one object where "Health" is `true`.

// 7. **Using `reduce`:**
//    - Calculate the total number of connections for all objects.

// 8. **Chaining Multiple Array Functions:**
//    - Chain together `filter`, `map`, and `reduce` to calculate the total latency for objects where "Health" is `true`.

// Remember, the best way to learn is by doing. Try to implement these tasks in your JavaScript code and experiment with the concepts. If you get stuck or need explanations for any part of the code, feel free to ask for help!