function staircase(n) {
    for (let i = 1; i <= n; i++) {
        let hash = "";
        for (let j = n; j > 0; j--) {   
            if (j<=i) {
                hash += "#";
            } else {
                hash += " ";
            }
        }
        console.log(hash);
    }
}
