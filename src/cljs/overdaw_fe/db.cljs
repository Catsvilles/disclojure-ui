(ns overdaw-fe.db)

(def default-db
  {:configs {:from 24 :to 96 :bars 8}
   :controls {:panel "track" :instr "bass"}
   :instr-controls {"bass" {:cutoff 1000}}
   :beat-controls {:amp 1}
   :editor {:duration 0.25 :amp 1}
   :instruments []
   :kit []})

(defn duration [db]
  (get-in db [:editor :duration]))

(defn editor [db]
  (get db :editor))
