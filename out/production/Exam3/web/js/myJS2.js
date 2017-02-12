
 var x;
 console.log("x=" + x);
 //alert("This is the value of x. " + x);
 x = 5.2;
 console.log("x=" + x);
 x="Alice";
 console.log("x=" + x);
 x='Bob';
 console.log("x=" + x);
 //document.getElementById("myP").innerHTML = "This is the value of x. " + x;
 console.log(5 + 3 * 2);
 console.log(5 - 3);
 console.log(5 * 3);
 console.log(5 / 3);
 console.log(5 % 3);
 console.log("Alice" + " " + "Bob");
 console.log("5" + 3 + 2);
 console.log(5 + 3 + "2");
 var i = 10;
 console.log("i=" + i);
 i++;
 console.log("i=" + i);
 i--;
 console.log("i=" + i);
 i /= 5;
 console.log("i=" + i);
 var no = 1;
 var bool = true;
 console.log(bool);
 console.log(no == 1);
 console.log(no != 1);
 console.log(no >= 1);
 var no = 1;
 console.log(no == "1");
 console.log(no === "1");
 console.log(no !== "1");
 console.log(true && false);
 console.log(true || false);
 console.log(!(true || false));// FALSE and TRUE
 var y = 5;
 if (y > 3) {
 console.log("Hi from gt 3.");
 } else {
 console.log("Hi from lt 3.");
 }
 for (var i = 0; i < 10; i++)
 console.log("Alice");
 while (y < 25) {
 if (y == 10) {
 break;
 }
 console.log("Alice");
 y++;
 }
 do {
 y++;
 console.log("On the dark side");
 } while (y < 50);
 console.log("On the dark side");
 var a = ["Alice", "Bob", 5, 121];
 console.log(a);
 var output = "";
 for (var i = 0; i < a.length; i++) {
 output += a[i] + "<br>";
 }
 document.getElementById("myP").innerHTML = output;
 var m = [["Alice", 52], ["Bob", 13]];
 console.log(m);
 var now = new Date();
 document.getElementById("myP").innerHTML = now;
 console.log(now.getDay());

function sayHello() {
    var name = document.getElementById("myName").value;
    console.log("Hi " + name + "!");
    document.getElementById("sayHi").innerHTML = "Hi " + name + "!";
}
/*
 var names = ["Bob", "Alice", "David", "Char"];
 console.log(names);
 names.sort();
 console.log(names);
 names.reverse();
 console.log(names);
 console.log(12 - "12");
 */
/*
 var nos = [12, 10, 6, 3];
 console.log(nos);
 nos.sort(function (a, b) {
 //console.log(a+"-"+b);
 return a-b;
 });
 nos.push("alice");
 console.log(nos);
 x = nos.pop();
 console.log(nos);
 console.log(x);
 nos = nos.concat(["Bob", "Alice", "David", "Char"]);
 console.log(nos);
 //    nos.reverse();
 //    console.log(nos);
 //radar, ada, rar, 1225221
 /*
 radar
 ada
 d
 */
