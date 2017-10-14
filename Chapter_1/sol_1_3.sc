(define (square x) (* x x))

(define (sum-square a b) (+ (square a) (square b)))

(define
  (proc a b c)
  (cond
   ((and (< a b) (< a c)) (sum-square b c))
   ((and (< b a) (< b c)) (sum-square a c))
   (else (sum-square a b))))
                   

(proc 5 3 4)