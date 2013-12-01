(def tails
  (fn [a-sequence]
    (if (= 0 (count a-sequence))
      (sequence (sequence a-sequence))
      ('(a-sequence (tails (rest a-sequence))))
      )))

(def tails
  (fn [a-sequence]
    (map drop (range (inc (count a-sequence))) (repeat a-sequence))
    ))

(doc repeat)

(doc apply)

(doc map)

[(drop 0 [1 2 3])
 (drop 1 [1 2 3])
 ]

'('(1))

(tails '())

(tails '(1 2 3 4))

(count '(1 2 3 4))

(doc size)

'('())
