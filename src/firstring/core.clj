(ns firstring.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.util.response :refer [response]]
            [firstring.view :as view]))

(defroutes my_routes
  (GET "/" [] (view/index-page))
  (GET "/rest" [] (response {:email "leomcarbal@gmail.com"}))
  (route/resources "/"))

(def app (wrap-json-response my_routes))
