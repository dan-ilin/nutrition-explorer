(ns food.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[food started successfully]=-"))
   :middleware identity})
