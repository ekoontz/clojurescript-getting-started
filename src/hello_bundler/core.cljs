(ns hello-bundler.core
  (:require [react]
            [react-dom]
            ["react-dom/client" :refer [createRoot] :as rdc]
            [mapbox-gl]))

(.log js/console (str "hello."))
(.log js/console react/Component)
(.log js/console (str "goodbye."))
(.log js/console (str "rdc: " rdc))
(.log js/console (str "createRoot: " createRoot))

(.log js/console (str "app element id: " (.getElementById js/document "app")))
;;(.log js/console (str "js/ReactDOM: " js/ReactDOM))

;;(.render js/ReactDOM
;;         (.createElement js/React "h2" nil "This part is dynamically generated.")
;;         (.getElementById js/document "app"))


