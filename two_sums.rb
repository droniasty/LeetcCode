def two_sum(nums,target)
    pairs = nums.map.with_index{|v,i| [v,i]}.sort
    i = 0
    j = pairs.length - 1
    while i < j
        sum = pairs[i][0] + pairs[j][0]
        if sum == target
            return [pairs[i][1],pairs[j][1]]
        elsif sum < target
            i += 1
        else
            j -= 1
        end
    end
    return []
end