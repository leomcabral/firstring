(defproject firstring "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler firstring.core/app
         :auto-reload? true
         :auto-refresh false}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring "1.6.3"]
                 [ring/ring-json "0.4.0"]
                 [hiccup "1.0.5"]
                 [compojure "1.6.1"]])
