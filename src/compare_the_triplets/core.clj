(ns compare-the-triplets.core)

;; https://www.hackerrank.com/challenges/compare-the-triplets/problem

(defn solve [a b]
  (let [result  (->> (interleave a b)
                     (partition 2)
                     (map (partial apply compare))
                     frequencies)]
    [(or (get result 1) 0) (or (get result -1) 0)]))

(solve [1 2 1] [2 3 1])
