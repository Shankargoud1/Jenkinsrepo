def checkout_git(String repo, String branch) {
    
    echo "this is checking out git code."
    git branch: 'main', credentialsId: 'shankar', url: "git@github.com:Shankargoud1/${repo}.git", branch: "${branch}" 
 }

return this