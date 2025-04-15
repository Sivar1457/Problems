```commandline
Input : 
    Board : {
              { C , A , A } ,
              { A , A , A } ,
              { B , C , D } ,
            }

    Word : AAB

Output : 

 Iteration : 1
     Current char : A [ 0 , 1 ]  , Expected char : A

     Iteration : 2
         Current char : A [ 1 , 1 ]  , Expected char : A
         Iteration : 3
             Current char : C [ 2 , 1 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 1 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 0 , 1 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 1 , 0 ]  , Expected char : B
         Backtracking... to Iteration - 2
     Iteration : 2
         Current char : A [ 0 , 2 ]  , Expected char : A
         Iteration : 3
             Current char : A [ 1 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 0 , 1 ]  , Expected char : B
         Backtracking... to Iteration - 2
     Iteration : 2
         Current char : C [ 0 , 0 ]  , Expected char : A
     Backtracking... to Iteration - 1
 Iteration : 1
     Current char : A [ 0 , 2 ]  , Expected char : A

     Iteration : 2
         Current char : A [ 1 , 2 ]  , Expected char : A
         Iteration : 3
             Current char : D [ 2 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 0 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 1 , 1 ]  , Expected char : B
         Backtracking... to Iteration - 2
     Iteration : 2
         Current char : A [ 0 , 1 ]  , Expected char : A
         Iteration : 3
             Current char : A [ 1 , 1 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 0 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : C [ 0 , 0 ]  , Expected char : B
         Backtracking... to Iteration - 2
     Backtracking... to Iteration - 1
 Iteration : 1
     Current char : A [ 1 , 0 ]  , Expected char : A

     Iteration : 2
         Current char : B [ 2 , 0 ]  , Expected char : A
     Iteration : 2
         Current char : A [ 1 , 1 ]  , Expected char : A
         Iteration : 3
             Current char : C [ 2 , 1 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 1 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 0 , 1 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 1 , 0 ]  , Expected char : B
         Backtracking... to Iteration - 2
     Iteration : 2
         Current char : C [ 0 , 0 ]  , Expected char : A
     Backtracking... to Iteration - 1
 Iteration : 1
     Current char : A [ 1 , 1 ]  , Expected char : A

     Iteration : 2
         Current char : C [ 2 , 1 ]  , Expected char : A
     Iteration : 2
         Current char : A [ 1 , 2 ]  , Expected char : A
         Iteration : 3
             Current char : D [ 2 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 0 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 1 , 1 ]  , Expected char : B
         Backtracking... to Iteration - 2
     Iteration : 2
         Current char : A [ 0 , 1 ]  , Expected char : A
         Iteration : 3
             Current char : A [ 1 , 1 ]  , Expected char : B
         Iteration : 3
             Current char : A [ 0 , 2 ]  , Expected char : B
         Iteration : 3
             Current char : C [ 0 , 0 ]  , Expected char : B
         Backtracking... to Iteration - 2
     Iteration : 2
         Current char : A [ 1 , 0 ]  , Expected char : A
         Iteration : 3
             Current char : B [ 2 , 0 ]  , Expected char : B
             The final Index found !!!
true

```