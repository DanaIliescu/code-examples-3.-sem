//Create an array with 4 fruit
var fruitArray = ["apple", "pear", "orange", "watermelon"];
console.log(fruitArray);

//Create an empty array and then add elemnts to it
var vegArray = [];
vegArray.push("tomato");
vegArray.push("potato");
vegArray.push("onion");
vegArray.push("squash");
vegArray.push(12);
console.log(vegArray);

//Delete the last element added
vegArray.pop();
console.log(vegArray);

//Delete the 3rd element
fruitArray.splice(2, 1);
console.log(fruitArray);

//Loop through the array
for (var i = 0; i < vegArray.length; i++){
  console.log("Vegetables: " + vegArray[i] + " ");
}

//Sort and reverse sort an array
vegArray.sort();
console.log(vegArray);
vegArray.reverse();
console.log(vegArray);

//Concatenate an array to another
console.log(vegArray.concat(fruitArray));

//Create DOM elements from JS
var element = document.createElement("h2");
element.innerHTML = "Hello from JS";
document.getElementById("myH1").after(element);

//Change DOM elements from JS
document.getElementById("myH1").innerHTML = (new Date()).toDateString();
// document.getElementById("myH1").innerHTML = vegArray;
// document.getElementById("myH1").innerHTML = 3+9;

//Remove DOM elements from JS
var element = document.getElementById("myH1");
element.parentNode.removeChild(element);

//Make an alert
//window.alert("Hi");
