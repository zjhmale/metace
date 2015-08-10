(ns metace.cota)

(def car first)
(def cdr rest)
(def cadr #(car (cdr %)))
(def cddr #(cdr (cdr %)))
(def caadr #(car (car (cdr %))))
(def caddr #(car (cdr (cdr %))))
(def cdadr #(cdr (cadr %)))
(def cadddr #(car (cdr (cddr %))))

(defn tagged-list?
  [exp tag]
  (if (list? exp)
    (= (car exp) tag)
    false))

(defn error [& msg] (prn (apply str msg)))