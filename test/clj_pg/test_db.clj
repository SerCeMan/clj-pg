(ns clj-pg.test-db
  (:require  [clojure.test :as t]
             [environ.core :refer [env]]))
(def db (or (env :database-url) "postgresql://aidbox:aidbox@localhost:5432/test"))
