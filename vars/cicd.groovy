def newGit(repo)
{
  git "https://github.com/Vijay01234/${repo}.git"
}
def build()
{
  sh 'mvn package'
}
