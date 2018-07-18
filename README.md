# java.samples
In this repository https://github.com/gurupatra/java.samples, 

you can now see 3 branches:

master -- the code base
feature/correct-gitignore  -- A branch created to show how git flow works
feature/structured-java-project -- New branch to add a structured java project

In the github central repository, the master branch is used to hold the code base. Any changes to the code is pushed to a new branch following the steps:

In local repository

git branch -b <branch_name>

generally branches are named like feature/<a_name> or task/<task_id> etc corresponding to the development task.

git add <file_name> 

the files changed are added to the git version tracking and staged for commit.

git commit -m "A meaningful message explaining the change"

git push origin feature/<branch_name>

when prompted use your github username and password, your changes will 
be posted to the repository.
