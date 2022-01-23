class Solution {
    func sequentialDigits(_ low: Int, _ high: Int) -> [Int] {
        var sequentialDigits: Set<Int> = Set<Int>()
        
        let lowWindowSize = String(low).count
        let highWindowSize = String(high).count
        
        let digits = [1,2,3,4,5,6,7,8,9]
        
        for windowSize in lowWindowSize...highWindowSize {
            var i = 0
             while i + windowSize <= 9 {
                let tempArray = digits[i..<i + windowSize]
                var squashed = 0
                for (index, num) in tempArray.enumerated() {
                    let temp: Int = (pow(10, tempArray.count - index - 1) as NSDecimalNumber).intValue
                    squashed += num * temp
                }
                print(squashed)
                sequentialDigits.insert(squashed)
                i += 1
            }
        }
        
        let array = Array(sequentialDigits)
        return array.sorted().filter({ $0 >= low && $0 <= high })
    
    }
}
