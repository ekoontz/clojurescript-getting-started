(ns hello-bundler.core
  (:require [react]
            ["react-dom/client" :as rcd]
            [mapbox-gl]))

;; https://18.react.dev/reference/react-dom/client/createRoot#reference
(def root (rcd/createRoot (.getElementById js/document "app")))

;; https://18.react.dev/reference/react/createElement#reference
(def h2 (react/createElement "h2" nil "Buurts en wijks."))
(.render root
         h2)

;; https://docs.mapbox.com/mapbox-gl-js/guides/
(.log js/console (str "two plus two is " (+ 2 2)))

(set! (. mapbox-gl -accessToken) "pk.eyJ1IjoiZWtvb250eiIsImEiOiJpSkF1VU84In0.fYYjf551Wds8jyrYV5MFwg")

(.log js/console (str "mapboxGL access token set to: " (. mapbox-gl -accessToken)))

(def map-props (js-obj "container" "map"
                       "style"      "mapbox://styles/mapbox/streets-v9"
                       "projection" "globe"
                       "zoom"       "13"
                       "center"     (js-obj "lng" "4.9" "lat" "52.37")))

(.log js/console (str "map-properties's center: " (. map-props -center)))

;; https://docs.mapbox.com/mapbox-gl-js/api/map/
(def map (mapbox-gl/Map. map-props))

