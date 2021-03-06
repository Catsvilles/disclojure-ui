(ns disclojure-ui.main
  (:gen-class)
  (:require [com.stuartsierra.component :as component]
            [disclojure-ui.system :refer [new-system]]))

(def config
  {:http {:port 3005}, :dev-mode? false})

(defn -main [& args]
  (let [system (new-system config)]
    (println "Starting HTTP server on port" (-> system :http :port))
    (component/start system)))
