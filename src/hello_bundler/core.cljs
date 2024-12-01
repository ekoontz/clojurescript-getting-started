(ns hello-bundler.core
  (:require [react]
            ["react-dom/client" :as rcd]
            [mapbox-gl]))

;; https://18.react.dev/
(def root (rcd/createRoot (.getElementById js/document "app")))

(def h2 (react/createElement "h2" nil "This is an H2."))
(.render root
         h2)

 
