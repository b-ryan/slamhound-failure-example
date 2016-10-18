(ns foo.core
  (:require [foo.bar :as foo-bar])
  (:gen-class))

(with-redefs [foo-bar/bar 8]
  (prn foo-bar/bar))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
