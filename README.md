# PalindromeCheckerApp
//Project Overview
PalindromeCheckerApp is a Java-based console application developed using IntelliJ IDEA and managed using Git & GitHub.

This project demonstrates:

Git branching strategy

Use case-based development

Pull request workflow

Basic Java application structure

Version control best practices

//Objective
The objective of this project is to:

Understand Git and GitHub workflow

Practice creating and managing branches

Implement multiple use cases using a structured development approach

Learn how to create pull requests and merge code into the main branch

Develop a Java console-based application for palindrome checking

//Tools & Technologies Used
Java

IntelliJ IDEA

Git

GitHub

Command Prompt / Terminal

//Project Setup Procedure
Step 1: Create Project Folder
Open Documents folder in your system

Create a new folder with your FullRollNo as the folder name

Step 2: Create GitHub Repository
Repository Name: PalindromeCheckerApp

Enable Add README file

Copy the repository URL

Step 3: Clone Repository
Open Command Prompt inside your created folder and run:

git clone <repository_url>

//IntelliJ Project Setup
Open IntelliJ IDEA

Click Open

Select the cloned repository folder

Create a new Java Module named App

Inside src folder create a class:

PalindromeCheckerApp.java
// Git Workflow Followed
1.Check Status
git status
2️. Create New Branch for Use Case
git checkout -b <branch_name>
Verify branch:
git branch
3️.Add Specific File Only
git add App/src/PalindromeCheckerApp.java
4️.Commit Changes
git commit -m "[Your_Name] Added <UseCaseName>"
5️.Push Branch
git push origin <branch_name>
Pull Request Process
Go to GitHub repository

Click Compare & Pull Request

Click Create Pull Request

Click Merge Pull Request

Click Confirm Merge