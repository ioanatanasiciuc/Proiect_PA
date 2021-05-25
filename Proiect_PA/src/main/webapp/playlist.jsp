<%--
  Created by IntelliJ IDEA.
  User: Ioana
  Date: 5/25/2021
  Time: 12:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
 <link rel="stylesheet" href="stylePlaylistPage.css">
 <title>Your Playlist</title>
</head>
<body>

<h1 class="text" id="title">Your Playlist</h1>
<div class = "PlaylistContainer">

 <div class = "ColumnTitles">
  <p class="text" id = "titleSong"> TITLE </p>
  <p class="text" id = "artist"> ARTIST</p>
 </div>
 <div class = "Songs" id = "Song1">
  <p class="text"> ${firstSetOfSongs[0][0]} </p>
  <p class="text" > ${firstSetOfSongs[0][1]}</p>
 </div>
 <div class = "Songs" id = "Song2">
  <p class="text"> ${firstSetOfSongs[1][0]} </p>
  <p class="text" > ${firstSetOfSongs[1][1]}</p>
 </div>
 <div class = "Songs" id = "Song3">
  <p class="text">${firstSetOfSongs[2][0]} </p>
  <p class="text" > ${firstSetOfSongs[2][1]}</p>
 </div>
 <div class = "Songs" id = "Song4">
  <p class="text">${firstSetOfSongs[3][0]} </p>
  <p class="text" > ${firstSetOfSongs[3][1]}</p>
 </div>
 <div class = "Songs" id = "Song5">
  <p class="text">${secondSetOfSongs[0][0]} </p>
  <p class="text" > ${secondSetOfSongs[0][1]}</p>
 </div>
 <div class = "Songs" id = "Song6">
  <p class="text">${secondSetOfSongs[1][0]} </p>
  <p class="text" > ${secondSetOfSongs[1][1]}</p>
 </div>
 <div class = "Songs" id = "Song7">
  <p class="text">${secondSetOfSongs[2][0]} </p>
  <p class="text" > ${secondSetOfSongs[2][1]}</p>
 </div>
 <div class = "Songs" id = "Song8">
  <p class="text">${thirdSetOfSongs[0][0]} </p>
  <p class="text" > ${thirdSetOfSongs[0][1]}</p>
 </div>
 <div class = "Songs" id = "Song9">
  <p class="text">${thirdSetOfSongs[1][0]} </p>
  <p class="text" > ${thirdSetOfSongs[1][1]}</p>
 </div>
 <div class = "Songs" id = "Song10">
  <p class="text">${thirdSetOfSongs[2][0]} </p>
  <p class="text" > ${thirdSetOfSongs[2][1]}</p>
 </div>

</div>

</body>
</html>
