;; create the main project namespace
(ns modern-cljs.core)

;; enable cljs to print to the JS console of the browser
(enable-console-print!)

;; print to the console
(dotimes [it 20]
  (println "Hola Daniel" it))

(dotimes [it 20]
  (println "Hola Federico" it))
