```commandline
/home/siva-zstch1466/.jdks/openjdk-22.0.2/bin/java -javaagent:/home/siva-zstch1466/IntelIj/idea-IC-243.21565.193/lib/idea_rt.jar=32863:/home/siva-zstch1466/IntelIj/idea-IC-243.21565.193/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/siva-zstch1466/RPA/First/out/production/First First.Problems.NQueens
Input : 5

--> SolveNQueen Method is called by main
Iteration : 1
--> PlaceCoin() method called by solveNQueens
 | Q | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
    Iteration : 2
    --> PlaceCoin() method called by recursion of placeCoin method
     | Q | . | . | . | . | 
     | . | . | Q | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | Q | . | . | . | . | 
         | . | . | Q | . | . | 
         | . | . | . | . | Q | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | Q | . | . | . | . | 
             | . | . | Q | . | . | 
             | . | . | . | . | Q | 
             | . | Q | . | . | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | Q | . | . | . | . | 
                 | . | . | Q | . | . | 
                 | . | . | . | . | Q | 
                 | . | Q | . | . | . | 
                 | . | . | . | Q | . | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
     | Q | . | . | . | . | 
     | . | . | . | Q | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | Q | . | . | . | . | 
         | . | . | . | Q | . | 
         | . | Q | . | . | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | Q | . | . | . | . | 
             | . | . | . | Q | . | 
             | . | Q | . | . | . | 
             | . | . | . | . | Q | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | Q | . | . | . | . | 
                 | . | . | . | Q | . | 
                 | . | Q | . | . | . | 
                 | . | . | . | . | Q | 
                 | . | . | Q | . | . | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
     | Q | . | . | . | . | 
     | . | . | . | . | Q | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | Q | . | . | . | . | 
         | . | . | . | . | Q | 
         | . | Q | . | . | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
    <-- Backtracking to Iteration 1
 | . | Q | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
    Iteration : 2
    --> PlaceCoin() method called by recursion of placeCoin method
     | . | Q | . | . | . | 
     | . | . | . | Q | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | Q | . | . | . | 
         | . | . | . | Q | . | 
         | Q | . | . | . | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | Q | . | . | . | 
             | . | . | . | Q | . | 
             | Q | . | . | . | . | 
             | . | . | Q | . | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | . | Q | . | . | . | 
                 | . | . | . | Q | . | 
                 | Q | . | . | . | . | 
                 | . | . | Q | . | . | 
                 | . | . | . | . | Q | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
     | . | Q | . | . | . | 
     | . | . | . | . | Q | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | Q | . | . | . | 
         | . | . | . | . | Q | 
         | Q | . | . | . | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | Q | . | . | . | 
             | . | . | . | . | Q | 
             | Q | . | . | . | . | 
             | . | . | . | Q | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
         | . | Q | . | . | . | 
         | . | . | . | . | Q | 
         | . | . | Q | . | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | Q | . | . | . | 
             | . | . | . | . | Q | 
             | . | . | Q | . | . | 
             | Q | . | . | . | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | . | Q | . | . | . | 
                 | . | . | . | . | Q | 
                 | . | . | Q | . | . | 
                 | Q | . | . | . | . | 
                 | . | . | . | Q | . | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
    <-- Backtracking to Iteration 1
 | . | . | Q | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
    Iteration : 2
    --> PlaceCoin() method called by recursion of placeCoin method
     | . | . | Q | . | . | 
     | Q | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | . | Q | . | . | 
         | Q | . | . | . | . | 
         | . | . | . | Q | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | . | Q | . | . | 
             | Q | . | . | . | . | 
             | . | . | . | Q | . | 
             | . | Q | . | . | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | . | . | Q | . | . | 
                 | Q | . | . | . | . | 
                 | . | . | . | Q | . | 
                 | . | Q | . | . | . | 
                 | . | . | . | . | Q | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
     | . | . | Q | . | . | 
     | . | . | . | . | Q | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | . | Q | . | . | 
         | . | . | . | . | Q | 
         | . | Q | . | . | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | . | Q | . | . | 
             | . | . | . | . | Q | 
             | . | Q | . | . | . | 
             | . | . | . | Q | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | . | . | Q | . | . | 
                 | . | . | . | . | Q | 
                 | . | Q | . | . | . | 
                 | . | . | . | Q | . | 
                 | Q | . | . | . | . | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
    <-- Backtracking to Iteration 1
 | . | . | . | Q | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
    Iteration : 2
    --> PlaceCoin() method called by recursion of placeCoin method
     | . | . | . | Q | . | 
     | Q | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | . | . | Q | . | 
         | Q | . | . | . | . | 
         | . | . | Q | . | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | . | . | Q | . | 
             | Q | . | . | . | . | 
             | . | . | Q | . | . | 
             | . | . | . | . | Q | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | . | . | . | Q | . | 
                 | Q | . | . | . | . | 
                 | . | . | Q | . | . | 
                 | . | . | . | . | Q | 
                 | . | Q | . | . | . | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
         | . | . | . | Q | . | 
         | Q | . | . | . | . | 
         | . | . | . | . | Q | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | . | . | Q | . | 
             | Q | . | . | . | . | 
             | . | . | . | . | Q | 
             | . | Q | . | . | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
     | . | . | . | Q | . | 
     | . | Q | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | . | . | Q | . | 
         | . | Q | . | . | . | 
         | . | . | . | . | Q | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | . | . | Q | . | 
             | . | Q | . | . | . | 
             | . | . | . | . | Q | 
             | . | . | Q | . | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | . | . | . | Q | . | 
                 | . | Q | . | . | . | 
                 | . | . | . | . | Q | 
                 | . | . | Q | . | . | 
                 | Q | . | . | . | . | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
    <-- Backtracking to Iteration 1
 | . | . | . | . | Q | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
 | . | . | . | . | . | 
    Iteration : 2
    --> PlaceCoin() method called by recursion of placeCoin method
     | . | . | . | . | Q | 
     | Q | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | . | . | . | Q | 
         | Q | . | . | . | . | 
         | . | . | . | Q | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
     | . | . | . | . | Q | 
     | . | Q | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | . | . | . | Q | 
         | . | Q | . | . | . | 
         | . | . | . | Q | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | . | . | . | Q | 
             | . | Q | . | . | . | 
             | . | . | . | Q | . | 
             | Q | . | . | . | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | . | . | . | . | Q | 
                 | . | Q | . | . | . | 
                 | . | . | . | Q | . | 
                 | Q | . | . | . | . | 
                 | . | . | Q | . | . | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
     | . | . | . | . | Q | 
     | . | . | Q | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
     | . | . | . | . | . | 
        Iteration : 3
        --> PlaceCoin() method called by recursion of placeCoin method
         | . | . | . | . | Q | 
         | . | . | Q | . | . | 
         | Q | . | . | . | . | 
         | . | . | . | . | . | 
         | . | . | . | . | . | 
            Iteration : 4
            --> PlaceCoin() method called by recursion of placeCoin method
             | . | . | . | . | Q | 
             | . | . | Q | . | . | 
             | Q | . | . | . | . | 
             | . | . | . | Q | . | 
             | . | . | . | . | . | 
                Iteration : 5
                --> PlaceCoin() method called by recursion of placeCoin method
                 | . | . | . | . | Q | 
                 | . | . | Q | . | . | 
                 | Q | . | . | . | . | 
                 | . | . | . | Q | . | 
                 | . | Q | . | . | . | 

                This formation is successfully worked !!!

                <-- Backtracking to Iteration 4
            <-- Backtracking to Iteration 3
        <-- Backtracking to Iteration 2
    <-- Backtracking to Iteration 1

Output
 | Q.... | ..Q.. | ....Q | .Q... | ...Q. | 
 | Q.... | ...Q. | .Q... | ....Q | ..Q.. | 
 | .Q... | ...Q. | Q.... | ..Q.. | ....Q | 
 | .Q... | ....Q | ..Q.. | Q.... | ...Q. | 
 | ..Q.. | Q.... | ...Q. | .Q... | ....Q | 
 | ..Q.. | ....Q | .Q... | ...Q. | Q.... | 
 | ...Q. | Q.... | ..Q.. | ....Q | .Q... | 
 | ...Q. | .Q... | ....Q | ..Q.. | Q.... | 
 | ....Q | .Q... | ...Q. | Q.... | ..Q.. | 
 | ....Q | ..Q.. | Q.... | ...Q. | .Q... | 

Process finished with exit code 0

```