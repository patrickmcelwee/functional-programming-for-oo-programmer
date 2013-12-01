(filter odd? [1 2 3 4])

(map inc [1 2 3 4])

(doc take)

(take 2 [1 2 3 4 5])

(distinct '(1 1 2 2 3 4 5))
 
(concat [1 2] [3] [4 5 6] '(7 8 9))

(doc concat)

(repeat 10 "yes! ")

(doc repeat)

(interleave [1 2 3 4 5] [10 9 8 7 6 11 12 13])

(doc drop)

(drop-last 1 [1 2 3 4 5 ])

(flatten [12 [3 10 [9 8]] 4 5])

(partition 2 3 [9] [1 2 3 4])

(doc partition)

(every? even? [1 1 1 1])

(doc every?)

(doc remove)

(remove (fn [n] (>= n 2)) [1 2 3 4])

; my recursive first-pass
(def prefix-of?
  (fn [candidate a-sequence]
    (if (empty? candidate)
      true
      (if (empty? a-sequence)
        false
        (if (= (first candidate) (first a-sequence))
          (prefix-of? (rest candidate) (rest a-sequence))
          false )))))

; better, from the book solutions
(def prefix-of?
  (fn [candidate seq]
    (= (take (count candidate) seq)
       candidate)
    ))

(prefix-of? [1] [])

(prefix-of? [] '(1 2))

(prefix-of? [1 2] [1 2 3 4])

(prefix-of? '(2 3) [1 2 3 4])

(prefix-of? '(1 2) [1 2 3 4])

(doc if)

(doc !=)

(doc 'true)

; Pick first three even numbers from list

; How many elements in list are redundant?
;
