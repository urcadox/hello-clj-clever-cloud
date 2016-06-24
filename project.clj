(defproject hello-clj-clever-cloud "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0-alpha5"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [leiningen "2.6.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler hello-clj-clever-cloud.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}}
  :aot :all
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"])
