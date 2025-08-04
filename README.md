# Maestro Java Client

<div align="center">

  <a href='https://github.com/Gero-Labs/maestro-java-client/actions/workflows/preprod.yml?query=workflow%3APreprod'><img src="https://img.shields.io/github/actions/workflow/status/Gero-Labs/maestro-java-client/preprod.yml?branch=main&label=Preprod&style=for-the-badge&logo=data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iNzUycHQiIGhlaWdodD0iNzUycHQiIHZlcnNpb249IjEuMSIgdmlld0JveD0iMCAwIDc1MiA3NTIiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+CiA8cGF0aCBkPSJtNTQ3LjIxIDI2MC40Ny00MS41MzEgNDEuNzE1Yy0wLjgzMjAzIDAuODMyMDMtMi4xMjg5IDEuMjAzMS0zLjIzODMgMS4wMTU2bC00Mi45MTgtNy43Njk1Yy0xLjQ4MDUtMC4yNzczNC0yLjY4MzYtMS40ODA1LTIuOTYwOS0yLjk2MDlsLTcuNjc1OC00Mi45MThjLTAuMTgzNTktMS4yMDMxIDAuMTgzNTktMi40MDYyIDEuMDE1Ni0zLjIzODNsNDEuNDM4LTQxLjYyNWMzLjIzODMtMy4yMzgzIDIuNzczNC04LjYwMTYtMC45MjU3OC0xMS4xOTEtOS4zNDM4LTYuNjYwMi0yMC40NDEtOS44OTg0LTI5LjQxNC05Ljg5ODQtMC42NDg0NCAwLTEuMjk2OSAwLTEuODUxNiAwLjA5Mzc1LTExLjU2MiAwLjY0ODQ0LTM2LjM1MiA3LjEyMTEtNTUuNDk2IDI3LjQ3My0xOC41OSAxOS42MDktMzguMDE2IDU2LjA1NS0yMC44MTIgOTYuNjYgMi4wMzUyIDQuOTAyMyA0LjM0NzcgMTEuMzc5LTIuNDk2MSAxOC4yMjMtNy4wMjM0IDYuODQ3Ny0xODQuNzEgMTc0LjE3LTE4NC43MSAxNzQuMTctMTYuNjQ4IDE0LjMzNi0xNS40NDUgNDAuODgzLTAuMDkzNzUgNTYuMzMyIDcuODYzMyA3Ljc2OTUgMTguNSAxMS44NCAyOC45NTMgMTEuODQgMTAuMjY2IDAgMjAuMjU4LTMuODg2NyAyNy4zNzktMTIuMTE3IDAgMCAxNjUuOTQtMTc2Ljc2IDE3NC4wOC0xODQuODEgMy42OTkyLTMuNjA1NSA3LjEyMTEtNC43MTg4IDEwLjI2Ni00LjcxODggMy4wNTA4IDAgNS44MjgxIDEuMTA5NCA3Ljk1MzEgMi4yMTg4IDkuMTU2MiA0LjcxODggMTkuNDI2IDYuODQzOCAyOS45NjkgNi44NDM4IDI0Ljc4OSAwIDUwLjg3MS0xMS40NjkgNjYuNzgxLTI3LjM3OSAyMi41Ny0yMi41NyAyNi43My00NC4zOTggMjcuMzc5LTU1LjU5IDAuNTU0NjktOS4xNTYyLTIuMDM1Mi0yMC45MDItOS44OTg0LTMxLjYzMy0yLjY4MzYtMy41MTU2LTcuOTUzMS0zLjg4NjctMTEuMTkxLTAuNzM4Mjh6bS0zMTMuMTkgMjc1LjgyYy01LjA4NTkgNC45OTYxLTEzLjMyIDQuOTk2MS0xOC40MDYgMC00Ljk5NjEtNS4wODU5LTQuOTk2MS0xMy4zMiAwLTE4LjQwNiA1LjA4NTktNC45OTYxIDEzLjMyLTQuOTk2MSAxOC40MDYgMCA0Ljk5NjEgNS4xNzk3IDQuOTk2MSAxMy40MSAwIDE4LjQwNnoiIGZpbGw9IiNmZmYiLz4KPC9zdmc+Cg==" alt="Preprod"/></a>
  <a href='https://github.com/Gero-Labs/maestro-java-client/actions/workflows/codeql.yml?query=workflow%3ACodeQL'><img src="https://img.shields.io/github/actions/workflow/status/Gero-Labs/maestro-java-client/codeql.yml?branch=main&style=for-the-badge&label=CodeQL&logo=data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iNzUycHQiIGhlaWdodD0iNzUycHQiIHZlcnNpb249IjEuMSIgdmlld0JveD0iMCAwIDc1MiA3NTIiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+CiA8cGF0aCBkPSJtNTE0LjI5IDI3NC4xOGMtNi4xNTYyLTUuNjgzNi04LjUyMzQtMTQuNjgtNS4yMTA5LTIyLjI1OGwyLjgzOTgtNy4xMDU1YzQuNzM0NC0xMC44OTEtMS40MjE5LTIzLjIwNy0xMi43ODUtMjYuNTJsLTcuNTc4MS0xLjg5NDVjLTguMDUwOC0yLjM2NzItMTMuNzM0LTkuNDcyNy0xNC4yMDctMTcuOTk2bC0wLjQ3MjY2LTcuNTc4MWMwLjAwMzkwNi0xMS44MzYtMTAuODkxLTIwLjM1OS0yMi4yNTQtMTguNDY1bC03LjU3ODEgMS40MThjLTguNTIzNCAxLjQyMTktMTYuNTc0LTIuMzY3Mi0yMC4zNjMtOS45NDUzbC0zLjc4OTEtNi42Mjg5Yy01LjY4MzYtMTAuNDE4LTE4Ljk0MS0xMy4yNjItMjguNDE0LTYuNjI4OWwtNi4xNTYyIDQuMjYxN2MtNi42Mjg5IDQuNzM0NC0xNi4xMDIgNC43MzQ0LTIyLjczIDBsLTYuMTU2Mi00LjczNDRjLTkuNDcyNy03LjEwNTUtMjMuMjA3LTMuNzg5MS0yOC44ODcgNi42Mjg5bC0zLjc4OTEgNi42Mjg5Yy00LjI2MTcgNy41NzgxLTEyLjMxMiAxMS4zNjctMjAuODM2IDkuOTQ1M2wtNy41NzgxLTEuNDIxOWMtMTEuODQtMS44OTQ1LTIyLjI1OCA2LjYyODktMjMuMjA3IDE4LjQ2OWwtMC40NzI2NiA3LjU3ODFjLTAuNDcyNjYgOC41MjM0LTYuMTU2MiAxNS42MjktMTQuMjA3IDE3Ljk5NmwtNy41ODIgMS44OTQ1Yy0xMS4zNjcgMy4zMTY0LTE3LjUyMyAxNS42MjktMTIuNzg1IDI2LjUybDIuODM5OCA3LjEwNTVjMy4zMTY0IDcuNTc4MSAwLjk0NTMxIDE2LjU3NC01LjIxMDkgMjIuMjU4bC01LjY4MzYgNS4yMTA5Yy04Ljk5NjEgNy41NzgxLTguOTk2MSAyMS43ODUgMCAyOS4zNjNsNS42ODM2IDUuMjEwOWM2LjE1NjIgNS42ODM2IDguNTIzNCAxNC42OCA1LjIxMDkgMjIuMjU4bC0zLjMxNjQgNy4xMDE2Yy00LjczNDQgMTAuODkxIDEuNDIxOSAyMy4yMDcgMTIuNzg1IDI2LjUybDcuNTc4MSAxLjg5NDVjOC4wNTA4IDIuMzY3MiAxMy43MzQgOS40NzI3IDE0LjIwNyAxNy45OTZsMC40NzI2NiA3LjU3ODFjMC40NzI2NiAxMS44NCAxMS4zNjcgMjAuMzYzIDIyLjczIDE4LjQ2OWw3LjU4Mi0xLjQyMTljOC41MjM0LTEuNDIxOSAxNi41NzQgMi4zNjcyIDIwLjM2MyA5Ljk0NTNsMy43ODkxIDYuNjI4OWM1LjY4MzYgMTAuNDE4IDE4Ljk0MSAxMy4yNjIgMjguNDE0IDYuNjI4OWw2LjE1NjItNC4yNjE3YzYuNjI4OS00LjczNDQgMTYuMTAyLTQuNzM0NCAyMi43MyAwbDYuMTU2MiA0LjczNDRjOS40NzI3IDcuMTA1NSAyMy4yMDcgMy43ODkxIDI4Ljg4Ny02LjYyODlsMy43ODkxLTYuNjI4OWM0LjI2MTctNy41NzgxIDEyLjMxMi0xMS4zNjcgMjAuODM2LTkuOTQ1M2w3LjU3ODEgMS40MjE5YzExLjg0IDEuODk0NSAyMi4yNTgtNi42Mjg5IDIzLjIwNy0xOC40NjlsMC40NzI2Ni03LjU3ODFjMC40NzI2Ni04LjUyMzQgNi4xNTYyLTE1LjYyOSAxNC4yMDctMTcuOTk2bDcuNTc4MS0xLjg5NDVjMTEuMzY3LTMuMzE2NCAxNy41MjMtMTUuNjI5IDEyLjc4NS0yNi41MmwtMi44Mzk4LTcuMTA1NWMtMy4zMTY0LTcuNTc4MS0wLjk0NTMxLTE2LjU3NCA1LjIxMDktMjIuMjU4bDUuNjgzNi01LjIxMDljOC45OTYxLTcuNTc4MSA4Ljk5NjEtMjEuNzg1IDAtMjkuMzYzem0tMTM4LjI5IDEwOC45M2MtNDkuMjU0IDAtODkuNTA4LTM5Ljc4MS04OS41MDgtODkuNTA4IDAtNDkuMjU0IDM5Ljc4MS04OS41MDggODkuNTA4LTg5LjUwOCA0OS4yNTQgMCA4OS41MDggMzkuNzgxIDg5LjUwOCA4OS41MDggMCA0OS43MjctNDAuMjU0IDg5LjUwOC04OS41MDggODkuNTA4em0zNC41NzQtMTM0Ljk3IDIxLjMxMiAyMS4zMTItNDguNzgxIDQ4Ljc3Ny0yMS4zMTIgMjEuMzEyLTQxLjY3Ni00MS42NzYgMjEuMzEyLTIxLjMxMiAyMC4zNjMgMjAuMzYzem0tODEuNDU3IDM1Mi4zNXYtMTMzLjU1YzUuNjgzNiAxLjg5NDUgMTEuMzY3IDMuMzE2NCAxNy41MjMgMy4zMTY0IDEwLjQxOCAwIDE5Ljg5MS0zLjMxNjQgMjguNDE0LTguOTk2MWwwLjQ3MjY2LTAuNDcyNjYgMC40NzI2NiAwLjQ2ODc1YzguNTIzNCA2LjE1NjIgMTguNDY5IDkuNDcyNyAyOC40MTQgOS40NzI3IDYuMTU2MiAwIDEyLjMxMi0xLjQyMTkgMTcuOTk2LTMuNzg5MXYxMzQuMDJjMCA0LjI2MTctNC43MzQ0IDYuMTU2Mi04LjA1MDggMy43ODkxbC0zNy40MTQtMzAuMzA5Yy0wLjk0NTMxLTAuOTQ1MzEtMi44Mzk4LTAuOTQ1MzEtNC4yNjE3IDBsLTM2LjQ2NSAyOS44MzZjLTIuMzY3MiAyLjM2NzItNy4xMDE2IDAuNDcyNjYtNy4xMDE2LTMuNzg5MXoiIGZpbGw9IiNmZmYiLz4KPC9zdmc+Cg==" alt="CodeQL"/></a>
  <a href='https://github.com/Gero-Labs/maestro-java-client/actions/workflows/codecov.yml?query=workflow%3ACodecov'><img src="https://img.shields.io/codecov/c/github/Gero-Labs/maestro-java-client?style=for-the-badge&token=E9FB0XQGUQ&logo=data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iNzUycHQiIGhlaWdodD0iNzUycHQiIHZlcnNpb249IjEuMSIgdmlld0JveD0iMCAwIDc1MiA3NTIiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+CiA8cGF0aCBkPSJtNTc5Ljc3IDM3Mi4yNmMtMy43NTM5IDMuNTAzOS05LjEyNSA0LjY3NTgtMTQgMy4wNDY5LTcuMDg1OS0xLjk5NjEtMTQuNDIyLTIuOTkyMi0yMS43ODUtMi45NTctMTcuNTk4IDAuMDE5NTMyLTM0Ljc5MyA1LjI4NTItNDkuMzgzIDE1LjEyNS0wLjI2NTYyIDAuMjgxMjUtMC41NDY4OCAwLjI4MTI1LTAuNjk1MzEgMC40MTQwNi0wLjgxNjQxIDAuNTM1MTYtMS43MDMxIDAuOTUzMTItMi42MzY3IDEuMjQyMi0wLjQxNDA2IDAuMTQ4NDQtMC44MjgxMyAwLjE0ODQ0LTEuMjQyMiAwLjI4MTI1LTAuODI0MjIgMC4xNjc5Ny0xLjY2MDIgMC4yNjE3Mi0yLjUgMC4yODEyNS0wLjEzMjgxIDAtMC40MTQwNiAwLjEzMjgxLTAuNTQ2ODggMC4xMzI4MXMtMC40MTQwNi0wLjEzMjgxLTAuNTYyNS0wLjEzMjgxaC0wLjAwMzkwNmMtMS42NjggMC4wMjM0MzgtMy4zMjQyLTAuMzA4NTktNC44NTE2LTAuOTc2NTYtMjkuMTUyLTExLjY0MS02MC4yOTctMTcuNDY5LTkxLjY4NC0xNy4xNTJ2MTc3LjgzYy0wLjI1MzkxIDEyLjIyMy02LjkxOCAyMy40MDYtMTcuNTQzIDI5LjQ0NS0xMC42MjkgNi4wMzkxLTIzLjY0OCA2LjAzOTEtMzQuMjc3IDAtMTAuNjI1LTYuMDM5MS0xNy4yOTMtMTcuMjIzLTE3LjU0My0yOS40NDV2LTIwLjgwOWMwLjI0MjE5LTcuNDg0NCA2LjM4MjgtMTMuNDI2IDEzLjg3NS0xMy40MjYgNy40ODgzIDAgMTMuNjI5IDUuOTQxNCAxMy44NzEgMTMuNDI2djIwLjgwOWMtMC4wODU5MzcgMS44OTQ1IDAuNjA1NDcgMy43NDIyIDEuOTE0MSA1LjExMzMgMS4zMTI1IDEuMzcxMSAzLjEyNSAyLjE0ODQgNS4wMTk1IDIuMTQ4NCAxLjg5ODQgMCAzLjcxMDktMC43NzczNCA1LjAyMzQtMi4xNDg0IDEuMzA4Ni0xLjM3MTEgMi0zLjIxODggMS45MTAyLTUuMTEzM3YtMTc3Yy0zMS40MjYgMi4xMDE2LTYyLjUyIDcuNzMwNS05Mi42ODggMTYuNzgxLTAuOTY4NzUgMC4yMzgyOC0xLjk2NDggMC4zMzIwMy0yLjk2MDkgMC4yODEyNS0wLjQ3MjY2IDAuMjA3MDMtMC45Njg3NSAwLjM0Mzc1LTEuNDc2NiAwLjQxNDA2LTAuMTMyODEgMC0wLjI4MTI1LTAuMTMyODEtMC41NDY4Ny0wLjEzMjgxaC0wLjAwMzkwN2MtMS44NzUgMC0zLjcyNjYtMC40MjU3OC01LjQxNDEtMS4yNDIyLTAuMTMyODEgMC0wLjEzMjgxIDAtMC4yODEyNS0wLjE0ODQ0LTI0LjczNC04LjU4OTgtNTAuNzgxLTEyLjc3LTc2Ljk1Ny0xMi4zNDQtNC4yOTMtMC4wMTU2MjUtOC4zMzU5LTIuMDE1Ni0xMC45NTMtNS40MTQxLTIuNjc1OC0zLjQxMDItMy41NTQ3LTcuODk0NS0yLjM2NzItMTIuMDYyIDAuNDI5NjktMS42NTYyIDQzLjU3LTE1My41NiAxOTMuNjUtMTYyLjQ0di0xNC4yODFjMC4yNDYwOS03LjQ4ODMgNi4zODY3LTEzLjQzIDEzLjg3NS0xMy40MyA3LjQ5MjIgMCAxMy42MzMgNS45NDE0IDEzLjg3NSAxMy40M3YxNC4yODFjMTUwLjA4IDguODc4OSAxOTMuMjIgMTYwLjc4IDE5My42NCAxNjIuNDQgMS4zOTQ1IDQuOTE4LTAuMDQ2ODc1IDEwLjIwMy0zLjc0NjEgMTMuNzM0eiIgZmlsbD0iI2ZmZiIvPgo8L3N2Zz4K" alt="Coverage"/></a>
  <a href='https://mvnrepository.com/artifact/io.github.gero-labs/maestro-java-client'><img src="https://img.shields.io/maven-central/v/io.github.Gero-Labs/maestro-java-client?logo=data%3Aimage%2Fsvg%2Bxml%3Bbase64%2CPD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iNzUycHQiIGhlaWdodD0iNzUycHQiIHZlcnNpb249IjEuMSIgdmlld0JveD0iMCAwIDc1MiA3NTIiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI%2BCiA8cGF0aCBkPSJtMjAwLjkyIDUxMC45Yy01LjAyMzQtNC4zMDQ3LTIxLjUyNy0xMS40OC0xOS4zNzUtMjYuNTUxIDMuNTg1OS0zMi4yODkgMTAuNzYyLTcyLjQ3MyAyNi41NTEtMTEyLjY2bDEwLjA0MyAzMi4yOTMgNS43NDIyLTY4Ljg4M2MxNC4zNTItMjcuOTg0IDMzLjAwOC01NC41MzUgNTguMTIxLTc4LjkzIDQuMzA0Ny00LjMwNDcgOC42MDk0LTguNjA5NCAxMy42MzMtMTIuMTk5bDQuMzA0NyAyNC4zOThjMzMuNzI3LTQ2LjY0MSA4My45NTMtNzguOTMgMTQ0LjIzLTkzLjI4MSA3LjE3NTgtMi4xNTIzIDE1LjA3LTMuNTg1OSAyMi4yNDItNS4wMjM0bDEzLjYzMyAzMy4wMDggMjAuODA5LTM4Ljc0NmM1Ny40MDYtNi40NjA5IDEwMS4xOC00LjMwODYgMTAxLjE4LTQuMzA4NiAyLjg3MTEgMS40MzM2LTE0LjM1MiAyNS4xMTMtNDQuNDg4IDYzLjg2M2wtMzYuNTk0IDguNjA5NCAyNS44MzIgNS4wMjM0Yy0xMS40OCAxNC4zNTItMjQuMzk4IDMwLjEzNy0zOC4wMzEgNDguMDc0LTIyLjI0Mi00LjMwNDctMzUuMTYgMS40MzM2LTQ1LjkyMi0yLjE1MjNsMjkuNDE4IDIyLjI0MmMtOS4zMjgxIDEwLjc2Mi0xNy45MzggMjIuMjQyLTI3Ljk4NCAzNC40NDFsLTYwLjI3MyA4LjYwOTQgNDMuMDU1IDEyLjkxNGMtNy4xNzU4IDguNjA5NC0xMy42MzMgMTYuNTA0LTIwLjgwOSAyNS4xMTMtNS4wMjM0IDUuNzQyMi0xMC4wNDcgMTIuMTk5LTE1LjA3IDE3LjkzOGwtNTMuODE2LTIuODcxMSAzNy4zMTIgMjAuMDljLTI1LjExMyAyNS44MzItNTAuOTQ1IDQ3LjM1OS03Ni4wNTkgNjYuMDE2bC01MC4yMjctMy41ODU5IDI4LjcwMyAxOC42NTZjLTE3LjkzOCAxMS40OC0zNC40NDEgMjEuNTI3LTQ5LjUxMiAyOS40MTgtMTMuNjMzIDcuMTc1OC0yNi41NTEtOC42MDk0LTMzLjAwOC0xMS40OGwyNjYuOTItMjk3Ljc3LTAuNzE4NzUgMC43MTg3NWMtMS40MzM2IDEuNDMzNi0xNjIuODggMTQ5Ljk3LTI2OS44IDI5NC4ybDQuMzA0NyAyLjg3MTFjLTE2LjUwNCAxOS4zNzUtMjcuMjY2IDI2LjU1MS00MC4xODQgNDkuNTEyLTcuMTc1OCAxMS40OC0xMC43NjIgMTcuOTM4LTEwLjc2MiAxNy45MzgtMi4xNTIzIDMuNTg1OS02LjQ1NyA0LjMwNDctMTAuMDQ3IDIuMTUyMy0zLjU4NTktMi4xNTIzLTQuMzA0Ny02LjQ1Ny0yLjE1MjMtMTAuMDQ3IDQuMzA4Ni03LjE3NTggMTUuMDctMjcuMjcgNDguNzk3LTY5LjYwNXoiIGZpbGw9IiNmZmYiLz4KPC9zdmc%2BCg%3D%3D&style=for-the-badge" alt="Maven"/></a>
  <a href='https://opensource.org/licenses/Apache-2.0'><img src="https://img.shields.io:/github/license/Gero-Labs/maestro-java-client?style=for-the-badge&color=blue&label=License" alt="License" /></a>

  <br/>
  <br/>

  <img src="https://www.gomaestro.org/images/logos/LandingLogos/WithText.svg" alt="Maestro Logo" >
</div>

## What is Maestro?

[Maestro](https://www.gomaestro.org/) is a powerful blockchain indexer for the Cardano blockchain that provides a comprehensive REST API for accessing blockchain data. Maestro offers high-performance, reliable access to on-chain data with minimal latency.

## Overview

**Maestro Java Client** is a Java REST Client library that provides type-safe access to the Maestro blockchain indexer APIs for Cardano. This library allows developers to interact with Cardano blockchain data using well-structured Java objects and handles all the complexities of HTTP communication, serialization, and error handling.

## Features

- 🚀 **Type-safe API access** with strongly-typed models
- 📄 **Built-in pagination support** with flexible query options
- 🔧 **Comprehensive error handling** and retry mechanisms
- 🗜️ **GZIP compression support** for improved performance
- ⚙️ **Configurable timeouts** and retry policies
- 🌐 **Multi-network support** (Mainnet, Preprod, Preview)
- 📊 **Complete API coverage** for all Maestro endpoints
- 🛡️ **Bean validation** support
- 📝 **Extensive documentation** and examples

## Supported Services

<details>
<summary>Comprehensive list of supported Maestro APIs</summary>

| Service Category | Endpoints         | Description                                              |
|------------------|-------------------|----------------------------------------------------------|
| **Accounts**     | `/accounts/*`     | Stake account information, rewards, history, delegations |
| **Addresses**    | `/addresses/*`    | Address details, UTXOs, transactions                     |
| **Assets**       | `/assets/*`       | Native assets, tokens, NFTs metadata                     |
| **Blocks**       | `/blocks/*`       | Block information, transactions                          |
| **Datum**        | `/datum/*`        | Script datum values                                      |
| **DEX**          | `/dex/*`          | Decentralized exchange data                              |
| **Epochs**       | `/epochs/*`       | Epoch information, parameters                            |
| **General**      | `/general/*`      | Chain info, protocol parameters                          |
| **Pools**        | `/pools/*`        | Stake pool information, delegators                       |
| **Policies**     | `/policies/*`     | Minting policies, assets                                 |
| **Scripts**      | `/scripts/*`      | Smart contract scripts                                   |
| **Transactions** | `/transactions/*` | Transaction details, submission                          |

</details>

## Version Compatibility

| Library Version | Maestro API | Java Version | Status   |
|-----------------|-------------|--------------|----------|
| 1.0.0+          | v1          | 11+          | ✅ Active |

## Library Usage

### Add Dependency

<details>
<summary>Maven</summary>

```xml
<dependency>
    <groupId>io.github.gero-labs</groupId>
    <artifactId>maestro-java-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

</details>

<details>
<summary>Gradle</summary>

```gradle
implementation 'io.github.gero-labs:maestro-java-client:1.0.0'
```

</details>

### Initialize Maestro Service

<details>
<summary>Simple Initialization</summary>

```java
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.BackendService;

// Initialize for Mainnet
String apiKey = "your-maestro-api-key";
BackendService maestroService = BackendFactory.getMaestroMainnetService(apiKey);

// Initialize for Preprod
BackendService maestroPreprodService = BackendFactory.getMaestroPreprodService(apiKey);

// Initialize for Preview
BackendService maestroPreviewService = BackendFactory.getMaestroPreviewService(apiKey);
```

</details>

### Example Usage

<details>
<summary>Get Account Information</summary>

```java
import adlabs.maestro.client.backend.api.account.model.TimestampedAccountInfo;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.factory.options.Options;

// Get account information
String stakeAddress = "stake1u9ylzsgxaa6xctf4juup682ar3juj85n8tx3hthnljg47zctvm3rc";
Result<TimestampedAccountInfo> result = maestroService.getAccountService()
    .getAccountInfo(stakeAddress, Options.EMPTY);

if (result.isSuccessful()) {
    TimestampedAccountInfo accountInfo = result.getValue();
    System.out.println("Total Balance: " + accountInfo.getData().getTotalBalance());
    System.out.println("Rewards: " + accountInfo.getData().getRewardsAvailable());
} else {
    System.err.println("Error: " + result.getResponse());
}
```

</details>

<details>
<summary>Query Assets with Pagination</summary>

```java
import adlabs.maestro.client.backend.api.asset.model.PaginatedAsset;
import adlabs.maestro.client.backend.factory.options.*;

// Query assets with pagination
Options options = Options.builder()
    .option(Count.of(100))
    .option(Order.desc())
    .build();

Result<PaginatedAsset> assets = maestroService.getAssetService()
    .getAssets(options);

if (assets.isSuccessful()) {
    PaginatedAsset paginatedAssets = assets.getValue();
    paginatedAssets.getData().forEach(asset -> {
        System.out.println("Asset: " + asset.getAssetName());
        System.out.println("Policy: " + asset.getPolicyId());
    });
    
    // Handle pagination
    String nextCursor = paginatedAssets.getNextCursor();
    if (nextCursor != null) {
        // Fetch next page
        Options nextPageOptions = Options.builder()
            .option(Count.of(100))
            .option(Cursor.of(nextCursor))
            .build();
    }
}
```

</details>

<details>
<summary>Submit Transaction</summary>

```java
import adlabs.maestro.client.backend.api.transaction.model.SubmitRequest;
import adlabs.maestro.client.backend.api.transaction.model.SubmitResponse;

// Submit a transaction
String txCbor = "84a40081..."; // Your transaction CBOR
SubmitRequest submitRequest = new SubmitRequest();
submitRequest.setCbor(txCbor);

Result<SubmitResponse> submitResult = maestroService.getTransactionService()
    .submitTransaction(submitRequest);

if (submitResult.isSuccessful()) {
    String txHash = submitResult.getValue().getTxHash();
    System.out.println("Transaction submitted: " + txHash);
}
```

</details>

### Advanced Query Example

<details>
<summary>Complex Filtering with Options</summary>

```java
import adlabs.maestro.client.backend.factory.options.filters.*;

// Build complex query with filters
Options complexOptions = Options.builder()
    .option(Count.of(50))
    .option(Order.asc())
    .option(new AssetNameFilter("MyNFT"))
    .option(new PolicyIdFilter("f0ff48bbb7bbe9d59a40f1ce90e9e9d0ff5002ec48f232b49ca0fb9a"))
    .build();

// Execute filtered query
Result<PaginatedAsset> filteredAssets = maestroService.getAssetService()
    .getAssets(complexOptions);
```

</details>

## Environment Variables

The library supports several environment variables for configuration:

| Variable | Description | Default |
|----------|-------------|---------|
| `MAESTRO_API_KEY` | Your Maestro API key | Required |
| `MAESTRO_READ_TIMEOUT_SEC` | Read timeout in seconds | 300 |
| `MAESTRO_CONNECT_TIMEOUT_SEC` | Connection timeout in seconds | 300 |
| `MAESTRO_RETRIES_COUNT` | Number of retries for failed requests | 5 |
| `MAESTRO_RETRY_SLEEP_TIME_SEC` | Sleep time between retries | 60 |
| `MAESTRO_GZIP_COMPRESSION` | Enable GZIP compression | true |
| `MAESTRO_JAVA_LIB_LOGGING` | Enable HTTP logging | false |

## Build Instructions

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Building from Source

```bash
# Clone the repository
git clone https://github.com/Gero-Labs/maestro-java-client.git
cd maestro-java-client

# Build the project
mvn clean install

# Run tests
mvn test

# Generate Javadoc
mvn javadoc:javadoc
```

## Used By

The following projects use Maestro Java Client:

- Your project here! [Submit a PR](https://github.com/Gero-Labs/maestro-java-client/pulls) to add your project.

## Contributing

We welcome contributions! Please see our [Contributing Guidelines](CONTRIBUTING.md) for details.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

- 📚 [Documentation](https://docs.maestro.org)
- 💬 [Discord Community](https://discord.gg/maestro)
- 🐛 [Issue Tracker](https://github.com/Gero-Labs/maestro-java-client/issues)
- 📧 [Contact Support](mailto:support@maestro.org)

---

<p align="center">
  Made with ❤️ by <a href="https://github.com/Gero-Labs">A.D. Labs</a>
</p>
