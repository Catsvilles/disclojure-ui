(ns overdaw-fe.play
  (:require [leipzig.live :as live]
            [leipzig.temperament :refer [equal]]
            [overdaw-fe.inst :as i]))

(defn play [name params]
  (live/play-note (merge params {:part name :pitch (equal (:note params))})))

(defmethod live/play-note :supersaw [{hertz :pitch seconds :duration amp :amp}]
  (when hertz
    (i/supersaw :freq hertz :duration seconds :amp (or amp 1))))

(defmethod live/play-note :bass [{hertz :pitch seconds :duration amp :amp}]
  (when hertz
    (i/bass :freq hertz :dur seconds :volume (or amp 1))))

(defmethod live/play-note :indie-bass [{hertz :pitch seconds :duration amp :amp}]
  (when hertz
    (i/indie-bass :freq hertz :dur seconds :amp (or amp 1))))

(defmethod live/play-note :wide-bass [{hertz :pitch seconds :duration amp :amp}]
  (when hertz
    (i/wide-bass :freq hertz :dur seconds :amp (or amp 1))))

(defmethod live/play-note :garage-bass [{hertz :pitch seconds :duration amp :amp}]
  (when hertz
    (i/g-bass :freq hertz :dur seconds :amp (or amp 1))))

(defmethod live/play-note :pad [{hertz :pitch seconds :duration amp :amp}]
  (when hertz
    (i/pad :freq hertz :dur seconds :amp (or amp 1))))

(defmethod live/play-note :talking-bass [{hertz :pitch seconds :duration amp :amp}]
  (when hertz
    (i/talking-bass :freq hertz :dur seconds :amp (or amp 1))))

(defmethod live/play-note :g-bass [{hertz :pitch seconds :duration amp :amp}]
  (when hertz
    (i/g-bass :freq hertz :dur seconds :amp (or amp 1))))