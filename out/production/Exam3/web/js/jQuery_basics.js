$(document).ready(function() {
  sayHello();
  addRows();
  minimizeImages();
});

function sayHello() {
  //javascript
  document.getElementById("js").innerHTML = "Hello from js";

  //jQuery
  $("#jq").text("Hi from jq");
}

$("form").submit(function(e) {
  e.preventDefault();
});

$("#submit_button").click(function() {
    var name = $("#name_input").val();
    var email = $("#email_input").val();
    var text = $("textarea").val();
    console.log(name + "\n" + email + "\n" + text + "\n");
});

function addRows() {
  var movies = [["Love and Friendship", "92 min.", "Kate Beckinsale, Chloë Sevigny"], ["Moonlight", "111 min.", "Mahershala Ali, Shariff Earp"]];
  for(var i = 0; i < movies.length; i++){
        var movie = movies[i];
        $('table tr:last').after('<tr><td>'+ movie[0] + '</td>' +
                                      '<td>'+ movie[1] + '</td>' +
                                      '<td>'+ movie[2] + '</td></tr>');
      }
}

function minimizeImages(){
  $('img').css("width", 100).css("height", 200);
}
