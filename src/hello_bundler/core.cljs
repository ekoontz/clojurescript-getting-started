(ns hello-bundler.core
  (:require [react]
            [react-dom]
            ["react-dom/client" :refer [createRoot]]
            [mapbox-gl]))

;; new (react 18):
(.render (createRoot (.getElementById js/document "app"))
         "hello!!")

;; old (react pre-18):
;;(.render js/ReactDOM
;;         (.createElement js/React "h2" nil "This part is dynamically generated.")
;;         (.getElementById js/document "app"))


 
