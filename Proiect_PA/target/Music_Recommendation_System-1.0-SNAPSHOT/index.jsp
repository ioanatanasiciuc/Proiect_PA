<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Music Recommendation System</title>
    <link rel="stylesheet" href="style.css">

</head>
<body>

<div >
    <h1>MUSIC RECOMMENDER SYSTEM</h1>

    <form action="getPlaylist" method="post">

        <p>
            Welcome to Music Recommender ! Please fill in this form so you can get a playlist that suits you taste.
        </p>

        <p>
            Firstly we will ask you to choose three of your favorite music genres (please make sure theyr're all different).
        </p>
        <p>

            First genre :
            <select id="firstGenre" name="firstGenre" required>
                <option  value="" disabled selected>Select First Genre</option>
                <option value="POP">POP</option>
                <option value="ROCK">ROCK</option>
                <option value="R&B">HIP-HOP</option>
                <option value="K-POP">K-POP</option>
            </select>
        </p>

        <p>
            Second genre:
            <select id="secondGenre" name="secondGenre" required>
                <option  value="" disabled selected>Select Second Genre</option>
                <option value="POP">POP</option>
                <option value="ROCK">ROCK</option>
                <option value="R&B">HIP-HOP</option>
                <option value="K-POP">K-POP</option>
            </select>
        </p>

        <p>
            Third genre :
            <select id="thirdGenre" name="thirdGenre" required>
                <option  value="" disabled selected>Select Third Genre</option>
                <option value="POP">POP</option>
                <option value="ROCK">ROCK</option>
                <option value="R&B">HIP-HOP</option>
                <option value="K-POP">K-POP</option>
            </select>
        </p>

        <p>
            Now, can some of them be explicit or not ?
            <select id="explicit" name="explicit">
                <option value="YES">YES</option>
                <option value="NO">NO</option>
            </select>
        </p>

        <p>
            And lastly please choose your favorite decade between these four :
            <select id="decade" name="decade">
                <option  value="" disabled selected>Select A Decade</option>
                <option value="1990">1990's</option>
                <option value="2000">2000's</option>
                <option value="2010">2010's</option>
                <option value="2020">2020's</option>
            </select>
        </p>
        <input type="submit" value="GET MY PLAYLIST"/>

    </form>
</div>
</body>
</html>