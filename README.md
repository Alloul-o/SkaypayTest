Test 2 questions bonus
Quest1:
Il n'est pas recommandé de placer toutes les fonctions dans une seule classe de service, 
car cela viole le principe de la responsabilité unique. Cela rend le code plus difficile à maintenir, 
à tester et à faire évoluer. Une meilleure approche consiste à séparer la logique en plusieurs classes, 
telles que UserService(), RoomService() et BookingService(), chacune gérant sa responsabilité spécifique pour une meilleure modularité et une plus grande clarté.
Quest2:
La fonction setRoom() est conçue pour ne pas avoir d'impact sur les réservations précédentes, 
ce qui est un bon choix pour garantir l'exactitude historique des données de réservation. 
Une autre solution consisterait à stocker un instantané des détails de la chambre (comme le type et le prix) directement dans l'enregistrement de la réservation. Ainsi, 
même si les détails de la chambre changent ultérieurement, les informations relatives à la réservation restent cohérentes avec ce que l'utilisateur a réservé à l'origine.
