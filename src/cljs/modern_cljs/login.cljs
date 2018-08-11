;; create the main project namespace
(ns modern-cljs.login)

(defn- get-element-by-id [id]
  (.getElementById js.document id))

(defn- set-element-by-id! [id value]
  (let [element (get-element-by-id id)]
    (set! (.-value element) value)))

(defn clean-form []
  (set-element-by-id! "email" "")
  (set-element-by-id! "password" ""))

(defn validate-form []
  (let [email (get-element-by-id "email")
        password (get-element-by-id "password")]
    (if (and (> (count (.-value email)) 0)
             (> (count (.-value password)) 0))
      true 
      (do
        (js/alert "Please, complete the form!")
        false))))

;; define the function to attach validate-form to onsubmit event of
;; the form
(defn init []
  ;; verify that js/document exists and that it has a getElementById
  ;; property
  (if (and js/document
           (.-getElementById js/document))
    ;; get loginForm by element id and set its onsubmit property to
    ;; our validate-form function
    (let [login-form (.getElementById js/document "loginForm")]
      (set! (.-onsubmit login-form) validate-form))))

;; initialize the HTML page in unobtrusive way
(set! (.-onload js/window) init)
