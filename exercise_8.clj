(def puzzle
  (fn [list]
    (list list)))

(puzzle '(1 2 3))

; Does not work because it puts a collection in the function position.
