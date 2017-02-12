$(document).ready(function(){
  getDramas2016();
  setInterval(function() {getDramas2016()}, 86400000); //24h
});

function getDramas2016(){
  var apiKey = "a94d53246d4d725fe4f43e2c3fb15089";
  var apiLink = "https://api.themoviedb.org/3/discover/movie?with_genres=18&primary_release_year=2014" + "?api_key=" + apiKey;

  $.ajax({
    'url' : 'https://api.themoviedb.org/3/discover/movie',
    'type' : 'GET',
    'data' : {
      'api_key' : apiKey
    },
    'success' : function (data) {
        console.log(data);

        $("ol").append("<li>Drama</li>");
        $.each(data.results, function(index, movie){
          $("ol").append("<ul><li>" + movie.original_title + "</li>");
        });
       $("ol").append("</ul>");
    }
  });
}
