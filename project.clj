(defproject crdt-edit "0.1.0-SNAPSHOT"
  :description "A collaborative text editor built on CRDTs"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  
  
  :profiles 
  {:dev {:source-paths ["dev" "src"]
         :dependencies [[org.clojure/tools.namespace "0.2.4"]
                        [org.clojars.gjahad/debug-repl "0.3.3"]]}})