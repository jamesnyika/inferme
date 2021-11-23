(defproject generateme/inferme "0.0.2-SNAPSHOT"
  :description "MCMC based Bayesian inference toolkit"
  :url "https://github.com/generateme/inferme"
  :license {:name "The Unlicense"
            :url "http://unlicense.org"}
  :scm {:name "git"
        :url "https://github.com/generateme/inferme/"}  
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [cljplot "0.0.2a-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[anglican "1.1.0"]
                                  [metaprob "0.1.0-SNAPSHOT"]]}})
